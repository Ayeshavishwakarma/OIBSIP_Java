package reservation;
import java.util.*;


	class Reservation{
	int pnr;
	String name,train,from,to,date;
	Reservation(int pnr,String name,String train,String from,String to,String date)
	{
		this.pnr=pnr;
		this.name=name;
		this.train=train;
		this.from=from;
		this.to=to;
		this.date=date;
		
		}}
	public class OnlineReservationSystem 
	{
		static Scanner sc=new Scanner(System.in);
		static ArrayList<Reservation>list=new ArrayList<>();
		public static void main(String[]args) 
		{
			System.out.println("=====online reservation system===");
			System.out.print("Enter User ID:");
			String User=sc.next();
			
			System.out.print("Enter Password:");
			String pass=sc.next();
			
			if(!User.equals("admin")|| !pass.equals("1234"))
			{
				System.out.println("Invalid Login");
				return;
			}
			System.out.println("Login Successful!");
			while(true) 
			{
				System.out.println("\n1.Reserve Ticket");
				System.out.println("2.cancel  Ticket");
				System.out.println("3.View All Reservation");
				System.out.println("4.Exit");
				
				System.out.println("Enter choice");
				int choice=sc.nextInt();
				switch(choice) 
				{
				case 1:
					reserve();
					break;
				case 2:
					cancel();
					break;
				case 3:
					view();
					break;
				case 4:
					System.out.println("thank you!");
					return;
				default:
					System.out.println("Invalid choice");
					
					
				}
			}
		}
		
		static void reserve() 
		{
			sc.nextLine();// clear buffer

			System.out.println("Enter name:");
			String name=sc.nextLine();	
			System.out.println("Enter Train Name:");
			String train=sc.nextLine();
			System.out.println("From");
			String from=sc.nextLine();
			System.out.println("To:");
			String to=sc.nextLine();
			System.out.println("Date(dd-mm-yyyy):");
			String date=sc.nextLine();
			int pnr=new Random().nextInt(10000);
			list.add(new Reservation(pnr,name,train,from,to,date));
			System.out.println("Reservation Successful!");
			System.out.println("Your PNR Number:"+pnr);
			}
		static void cancel()
		{
			System.out.print("Enter PNR to cancle:");
			int pnr=sc.nextInt();
			Iterator<Reservation>it=list.iterator();
			while(it.hasNext())
			{
				Reservation r=it.next();
				if(r.pnr==pnr) 
				{
					it.remove();
					System.out.println("Ticket cancelled Successfully!");
				return;
				}
				
			}
			System.out.println("PNR Not Found!");
			
		}
		static void view()
		{
			if(list.isEmpty()) 
			{
				System.out.println("No Reservation Found!");
				return;
			}
			 
			System.out.println("\n--- Reservation List---");
			for (Reservation r:list) 
			{
				System.out.println("PNR:" +r.pnr 
						+" | Name:"+r.name+
						" | Train:"+r.train+
						" | From:"+r.from+
						" | To:"+r.to +
						" | Date:"+r.date );
			}
			
		}
}
