package com.srijan.restclient.controller;

import com.srijan.restclient.model.CloudVendor;
import com.srijan.restclient.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    private CloudVendorService cloudVendorService;
    //constructor based injection
    public CloudVendorController(@Autowired CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }


    // Read Specific Cloud Vendor Details
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){

        return  cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping("/all-vendors")
    public List<CloudVendor> getAllCloudVendorDetails(){

        return  cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public  String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        return cloudVendorService.createCloudVendor(cloudVendor);
        //return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        return cloudVendorService.updateCloudVendor(cloudVendor);
        //return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.deleteCloudVendor(vendorId);
        //return "Cloud Vendor Deleted Successfully";
    }

}
