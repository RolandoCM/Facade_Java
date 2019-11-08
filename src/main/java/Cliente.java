public class Cliente {
    public static void main (String [] args){
        ScheduleServer server = new ScheduleServer();

        IFacade facade = new FacadeImpl(server);
        facade.startServer();
        System.out.println("Start server");
        facade.stopServer();
        System.out.println("Stop server");
    }
}
