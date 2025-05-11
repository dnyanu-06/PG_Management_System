//package com.project.pgmanagementsystem.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.project.pgmanagementsystem.entity.Owner;
//import com.project.pgmanagementsystem.service.OwnerService;
//
//@Controller
//@RequestMapping("/admin/owners")
//public class OwnerController {
//
//    @Autowired
//    private OwnerService ownerService;
//
//    @GetMapping("/register-owner")
//    public String showRegisterOwnerPage(Model model) {
//        model.addAttribute("owner", new Owner()); // ✅ Ensure the form receives an empty Owner object
//        return "owner_register";  
//    }
//
//    @PostMapping("/register-owner")
//    public String processOwnerRegistration(@RequestParam String name,
//                                           @RequestParam String email,
//                                           @RequestParam String address,
//                                           RedirectAttributes redirectAttributes) {
//        // ✅ Create an owner object using Lombok @Builder
//        Owner owner = Owner.builder()
//                .name(name)
//                .email(email)
//                .address(address)
//                .status(Owner.Status.PENDING) // ✅ Default status
//                .build();
//
//        // Save to database
//        String message = ownerService.registerOwner(owner);
//
//        // Pass success message to the index page
//        redirectAttributes.addFlashAttribute("message", message);
//
//        // Redirect to index page
//        return "redirect:/";
//    }
//    
//    @GetMapping
//    public String showManageOwners(Model model) {
//        model.addAttribute("pendingOwners", ownerService.getPendingOwners());
//        model.addAttribute("approvedOwners", ownerService.getApprovedOwners());
//        return "manage-owners";
//    }
//    @PostMapping("/approve/{id}")
//    public String approveOwner(@PathVariable("id") Long id) {
//        ownerService.approveOwner(id);
//        return "redirect:/admin/owners";
//    }
//
//
//
//    @PostMapping("/delete/{id}")
//    public String deleteOwner(@PathVariable("id") Long id) {
//        ownerService.deleteOwner(id);
//        return "redirect:/admin/owners";
//    }
//}
