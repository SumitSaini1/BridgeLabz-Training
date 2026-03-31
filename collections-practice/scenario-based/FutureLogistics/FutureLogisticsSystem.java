package FutureLogistics;
import java.util.Scanner;
public class FutureLogisticsSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();

        Utility utility = new Utility();
        GoodsTransport goodsTransport = utility.parseDetails(input);

        if (goodsTransport == null) {
            return;
        }

        String type = utility.findObjectType(goodsTransport);

        System.out.println("Transporter id : " + goodsTransport.getTransportId());
        System.out.println("Date of transport : " + goodsTransport.getTransportDate());
        System.out.println("Rating of the transport : " + goodsTransport.getTransportRating());

        if (type.equals("BrickTransport")) {

            BrickTransport bt = (BrickTransport) goodsTransport;

            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
            System.out.println("Vehicle for transport : " + bt.vehicleSelection());
            System.out.println("Total charge : " + bt.calculateTotalCharge());

        } else if (type.equals("TimberTransport")) {

            TimberTransport tt = (TimberTransport) goodsTransport;

            System.out.println("Type of the timber : " + tt.getTimberType());
            System.out.println("Timber price per kilo : " + tt.getTimberPrice());
            System.out.println("Vehicle for transport : " + tt.vehicleSelection());
            System.out.println("Total charge : " + tt.calculateTotalCharge());
        }
    
	

	}

}
