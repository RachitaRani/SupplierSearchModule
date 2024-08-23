package com.example.suppliersearch;

import com.example.suppliersearch.Controller.SupplierController;
import com.example.suppliersearch.Model.ManufacturingProcess;
import com.example.suppliersearch.Model.NatureOfBusiness;
import com.example.suppliersearch.Model.Supplier;
import com.example.suppliersearch.Service.SupplierService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(SupplierController.class)
class SuppliersearchApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private SupplierService supplierService;

	@Test
	public void testQuerySuppliers() throws Exception {
		Supplier supplier = new Supplier();
		supplier.setCompanyName("Test Company");
		supplier.setLocation("India");
		supplier.setNatureOfBusiness(NatureOfBusiness.SMALL_SCALE);
		supplier.setManufacturingProcesses(List.of(ManufacturingProcess.PRINTING_3D));

		Page<Supplier> page = new PageImpl<>(List.of(supplier));

		when(supplierService.searchSuppliers("India", NatureOfBusiness.SMALL_SCALE, ManufacturingProcess.PRINTING_3D, 0, 10)).thenReturn(page);

		mockMvc.perform(post("/api/supplier/query")
				.param("location", "Hyderabad")
				.param("natureOfBusiness", "SMALL_SCALE")
				.param("manufacturingProcess", "MOULDING")
				.param("page", "0")
				.param("size", "10"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.content[0].companyName").value("Test Company"));
	}

//	@Test
//	void contextLoads() {
//	}

}
