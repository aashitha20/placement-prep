class Service { double cost; }
class VacationPackage {
    java.util.List<Service> services = new java.util.ArrayList<>();
    java.util.List<VacationPackage> subs = new java.util.ArrayList<>();
}

class TravelCost {
    double totalCost(VacationPackage p){
        double sum = 0;
        for(Service s : p.services) sum += s.cost;
        for(VacationPackage sub : p.subs) sum += totalCost(sub);
        return sum;
    }
}
