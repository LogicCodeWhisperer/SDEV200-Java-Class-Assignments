import javax.swing.*;
import java.awt.*;
public class MainJFrame extends JFrame 
{
    private int choice;
    private ImageIcon logo = new ImageIcon("./Images/ProgramIcon.png");
    private JPanel topOfPanel = new JPanel();
    private static JButton View = new JButton("View Recipe");; //View button declared here to allow for enable and disable method
    private JButton Add = new JButton("Add Recipe");
    private JButton Update = new JButton("Update Recipe");
    private JButton Remove = new JButton("Remove Recipe");
    private JButton Exitprogram = new JButton("Exit program");

    public MainJFrame(Recipe[] recipes) 
    {
        setTitle("Recipe Book");
        setSize(650, 75);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(logo.getImage());
        setLayout(new BorderLayout());
        
        topOfPanel.add(View);
        topOfPanel.add(Add);
        topOfPanel.add(Update);
        topOfPanel.add(Remove);
        topOfPanel.add(Exitprogram);
        add(topOfPanel, BorderLayout.NORTH);

        //Button ActionListener calls to corrisponding methods 
        View.addActionListener(e -> {RecipeBook.ViewRecipe(recipes);});
        Add.addActionListener(e -> {RecipeBook.AddRecipe(recipes);});
        Update.addActionListener(e -> {RecipeBook.UpdateRecipe(recipes);});
        Remove.addActionListener(e -> {RecipeBook.RemoveRecipe(recipes);});
        Exitprogram.addActionListener(e -> {
            choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to close the program?",
                                                         "Exit Program", JOptionPane.YES_NO_OPTION);
            if(choice == JOptionPane.YES_OPTION)
                System.exit(0);
        });
    }

    public static void setViewButton(boolean enabled)
    {
        if(enabled == false)
            View.setEnabled(false);
        else
            View.setEnabled(true);
    }
        
    public static void main(String[] args) 
    {
        final int maxCards = 10;                            //Constant variable for maximum allowed recipes
        Recipe[] recipes = new Recipe[maxCards];            //Object array for RecipeCard, representing one recipe per element
        RecipeCard.ReadStoredRecipes(recipes, true);        //Immediately calls method to read from folder containing file
        SwingUtilities.invokeLater(() -> {
            new MainJFrame(recipes).setVisible(true);
        });
    }
}