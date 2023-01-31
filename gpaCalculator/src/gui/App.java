package gui;

public class App {

    private AppWindow appWindow;
    private AppPanel appPanel;

    public App() {
        appPanel = new AppPanel();
        appWindow = new AppWindow(appPanel);
    }
}
