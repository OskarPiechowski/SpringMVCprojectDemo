package service;

import org.springframework.stereotype.Service;
import request.PlanetCreationRequest;
@Service
public class PlanetService {

    public void createPlanet(PlanetCreationRequest request){
        System.out.println("Tworzę planetę: " + request);

    }
}
