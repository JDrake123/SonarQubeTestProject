package PackageOne;

import javax.swing.*;
import java.awt.*;

public class SimpleRegistration {
    JFrame RegistrationJFrame;
    JPanel PersonalInformationJPanel, ContactInformationJPanel, ResidentialInformationJPanel,  WorkInformationJPanel;

    public SimpleRegistration() {
        this.PrepareRegistrationJFrame();
    }

    public JFrame PrepareRegistrationJFrame(){

        JFrame.setDefaultLookAndFeelDecorated(true);
        RegistrationJFrame = new JFrame("Registration Frame");
        RegistrationJFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        RegistrationJFrame.setLayout(new GridLayout(1,4));
        RegistrationJFrame.add(this.PreparePersonalInformationJPanel());
        RegistrationJFrame.add(this.PrepareContactInformationJPanel());
        RegistrationJFrame.add(this.PrepareWorkInformationJPanel());
        RegistrationJFrame.add(this.PrepareResidentialInformationJPanel());
        RegistrationJFrame.setVisible(true);
        return RegistrationJFrame;
    }

    public JPanel PreparePersonalInformationJPanel(){
        PersonalInformationJPanel = new JPanel();
        PersonalInformationJPanel.setBorder(BorderFactory.createTitledBorder("Personal Information"));
        return PersonalInformationJPanel;
    }

    public JPanel PrepareContactInformationJPanel(){
        ContactInformationJPanel = new JPanel();
        ContactInformationJPanel.setBorder(BorderFactory.createTitledBorder("Contact Information"));
        return ContactInformationJPanel;
    }

    public JPanel PrepareWorkInformationJPanel(){
        WorkInformationJPanel = new JPanel();
        WorkInformationJPanel.setBorder(BorderFactory.createTitledBorder("Work Information"));
        return WorkInformationJPanel;
    }

    public JPanel PrepareResidentialInformationJPanel(){
        ResidentialInformationJPanel = new JPanel();
        ResidentialInformationJPanel.setBorder(BorderFactory.createTitledBorder("Residential Information"));
        return ResidentialInformationJPanel;
    }

}
