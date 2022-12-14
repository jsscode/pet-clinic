package com.codejss.petclinic.boostrap;


import com.codejss.petclinic.models.*;
import com.codejss.petclinic.services.OwnerService;
import com.codejss.petclinic.services.PetTypeService;
import com.codejss.petclinic.services.SpecialtyService;
import com.codejss.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author codejss
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService,
                      PetTypeService petTypeService, SpecialtyService specialtyService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {

        var count = petTypeService.findAll().size();
        if (count == 0)
            loadData();

    }

    private void loadData() {
        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        var savedRadiology = specialtyService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        var savedSurgery = specialtyService.save(surgery);

        var dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        var savedDentistry = specialtyService.save(dentistry);

        PetType dog = new PetType();
        dog.setPetName("Dog");
        var savedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setPetName("cat");
        var savedCat = petTypeService.save(cat);

        System.out.println("Loader PetTypes.........");

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 ST Carolina");
        owner1.setCity("Miami");
        owner1.setTelephone("23457532");

        Pet mickaelPet = new Pet();
        mickaelPet.setName("Negrito");
        mickaelPet.setPetType(savedDog);
        mickaelPet.setBirthDate(LocalDate.now());
        mickaelPet.setOwner(owner1);
        owner1.getPets().add(mickaelPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glennane");
        owner2.setAddress("123 ST Carolina");
        owner2.setCity("Miami");
        owner2.setTelephone("234767532");

        var fionaPet = new Pet();
        fionaPet.setName("Meo");
        fionaPet.setOwner(owner2);
        fionaPet.setPetType(savedCat);
        fionaPet.setBirthDate(LocalDate.now());
        owner2.getPets().add(fionaPet);

        ownerService.save(owner2);

        System.out.println("Loader Owners.........");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Peter");
        vet2.setLastName("Campbell");
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loader Vets.........");
    }
}
