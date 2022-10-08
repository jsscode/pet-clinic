package com.codejss.petclinic.boostrap;


import com.codejss.petclinic.models.Owner;
import com.codejss.petclinic.models.PetType;
import com.codejss.petclinic.models.Vet;
import com.codejss.petclinic.services.OwnerService;
import com.codejss.petclinic.services.PetTypeService;
import com.codejss.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author codejss
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setPetName("Dog");
        petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setPetName("cat");
        petTypeService.save(cat);

        System.out.println("Loader PetTypes.........");

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glennane");

        ownerService.save(owner2);

        System.out.println("Loader Owners.........");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Peter");
        vet2.setLastName("Campbell");

        vetService.save(vet2);

        System.out.println("Loader Vets.........");

    }
}
