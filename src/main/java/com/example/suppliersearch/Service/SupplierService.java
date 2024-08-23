package com.example.suppliersearch.Service;

import com.example.suppliersearch.Model.ManufacturingProcess;
import com.example.suppliersearch.Model.NatureOfBusiness;
import com.example.suppliersearch.Model.Supplier;
import com.example.suppliersearch.Repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    public Page<Supplier> searchSuppliers(String location, NatureOfBusiness natureOfBusiness, ManufacturingProcess manufacturingProcess, int page, int size) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContains(location, natureOfBusiness, manufacturingProcess, PageRequest.of(page, size));
    }
}
