package com.codejss.petclinic.boostrap;


import com.codejss.petclinic.models.Owner;
import com.codejss.petclinic.models.Vet;
import com.codejss.petclinic.services.OwnerService;
import com.codejss.petclinic.services.VetService;
import com.codejss.petclinic.services.map.OwnerServiceMap;
import com.codejss.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author codejss
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Fiona");
        owner1.setLastName("Glennane");

        ownerService.save(owner2);

        System.out.println("Loader Owners.........");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Peter");
        vet1.setLastName("Campbell");

        vetService.save(vet2);

        System.out.println("Loader Vets.........");



    }
}