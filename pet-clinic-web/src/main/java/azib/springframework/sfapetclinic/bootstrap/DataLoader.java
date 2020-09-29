package azib.springframework.sfapetclinic.bootstrap;

import azib.springframework.sfapetclinic.model.Owner;
import azib.springframework.sfapetclinic.model.Pet;
import azib.springframework.sfapetclinic.model.PetType;
import azib.springframework.sfapetclinic.model.Vet;
import azib.springframework.sfapetclinic.services.OwnerService;
import azib.springframework.sfapetclinic.services.PetService;
import azib.springframework.sfapetclinic.services.PetTypeService;
import azib.springframework.sfapetclinic.services.VetService;
import azib.springframework.sfapetclinic.services.map.OwnerServiceMap;
import azib.springframework.sfapetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader( OwnerService ownerService,  VetService vetService, PetTypeService petTypeService) {
      this.ownerService = ownerService;
      this.vetService = vetService;
      this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);


        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);



        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAdddress("123 Bricket");
        owner1.setCity("Miami");
        owner1.setTelephone("12343434343");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Gleanne");
        owner2.setAdddress("123 Bricket");
        owner2.setCity("Miami");
        owner2.setTelephone("12343434343");

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);


        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Tony");
        vet2.setLastName("Stark");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");


    }
}
