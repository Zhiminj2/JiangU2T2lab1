public class RectangleRunner {
    public static void main (String[]args){
        Rectangle plot1 = new Rectangle(150,200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        plot1.setWidth(75);
        plot2.setWidth(75);
        plot3.setWidth(75);
        plot2.setLength(75);

        int AreaPlot1 = plot1.calculateArea();
        int AreaPlot2 = plot2.calculateArea();
        int AreaPlot3 = plot3.calculateArea();
        int seedRequired = AreaPlot1+AreaPlot2+AreaPlot3;
        System.out.println("These three plots requires "+ seedRequired + "square feet of seeds.");
    }

}
