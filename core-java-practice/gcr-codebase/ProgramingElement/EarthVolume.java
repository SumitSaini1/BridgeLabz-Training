public class EarthVolume {
    public static void Calculatevolume() {
        double pi = 3.14;
        int radiusKm = 6378;
        double VolumeKm = 4.0 / 3 * pi * radiusKm * radiusKm * radiusKm; // volume in Km

        double radiusMiles = radiusKm * 0.621371; // convert km to miles
        double volumeMiles = (4.0 / 3) * pi * radiusMiles * radiusMiles * radiusMiles;
        System.out.println(
                "The volume of earth in cubic kilometers is " + VolumeKm + " and cubic miles is " + volumeMiles);

    }
    public static void main(String[] args) {
        EarthVolume.Calculatevolume();
    }
    
}
