@ResController

public class controller{

public class carController{


    private carRepository repository;
    requestMapping("/cars")
    public Iterables<car> getCar(){
    return repository.findAll();
    
    }
}

}