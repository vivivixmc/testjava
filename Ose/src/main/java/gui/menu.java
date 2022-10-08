package gui;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame implements ActionListener {
    final   String     ROOT  = "<html><font color=blue>Корневая запись";
    // Массив листьев деревьев
    final   String[]   nodes = new String[]  {"Напитки", "Сладости", "Фрукты"};
    final   String[][] leafs = new String[][]{{"Чай", "Кофе", "Коктейль", "Сок", "Морс", "Минералка"},
            {"Пирожное", "Мороженое",
                    "Зефир", "Халва"},
            {"Груша"}};
    JFrame frame = new JFrame();
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenu helpMenu = new JMenu("Help");
    JMenuItem openItem = new JMenuItem("Open");
    JMenuItem preferenceItem = new JMenuItem("Preference");
    JMenuItem helpItem = new JMenuItem("Help");
    JPanel mainPanel = new JPanel();
    JPanel sidePanel = new JPanel();
    JTree tree = new JTree(createTreeModel());
    DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();



    public void MenuPage(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLayout(new BorderLayout(2,2));
        frame.setJMenuBar(menuBar);
        mainPanel.setBackground(Color.GREEN);
        sidePanel.setBackground(Color.RED);
        sidePanel.setPreferredSize(new Dimension(250,400));

        openItem.addActionListener(this);
        preferenceItem.addActionListener(this);
        helpItem.addActionListener(this);
        fileMenu.add(openItem);
        fileMenu.add(preferenceItem);
        helpMenu.add(helpItem);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        frame.add(mainPanel,BorderLayout.CENTER);
        frame.add(sidePanel,BorderLayout.WEST);

        frame.setVisible(true);
        frame.setResizable(false);
        tree.setCellRenderer(renderer);
        tree.setRootVisible(false);
        tree.setExpandsSelectedPaths(true);
        for (int i = 0; i < tree.getRowCount(); i++) {
            tree.expandRow(i);
        }

        JScrollPane lits = new JScrollPane(tree,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        lits.setSize(new Dimension(sidePanel.getWidth(),sidePanel.getHeight()));

        sidePanel.add(lits,BorderLayout.CENTER);

    }
    private TreeModel createTreeModel()
    {
        // Корневой узел дерева
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(ROOT);
        // Добавление ветвей - потомков 1-го уровня
        DefaultMutableTreeNode drink = new DefaultMutableTreeNode(nodes[0]);
        DefaultMutableTreeNode sweet = new DefaultMutableTreeNode(nodes[1]);
        DefaultMutableTreeNode fruit = new DefaultMutableTreeNode(nodes[2], true);
        // Добавление ветвей к корневой записи
        root.add(drink);
        root.add(sweet);
        root.add(fruit);
        // Добавление листьев - потомков 2-го уровня
        for ( int i = 0; i < leafs[0].length; i++)
            drink.add(new DefaultMutableTreeNode(leafs[0][i], false));
        for ( int i = 0; i < leafs[1].length; i++)
            sweet.add(new DefaultMutableTreeNode(leafs[1][i], false));
        for ( int i = 0; i < leafs[2].length; i++)
            fruit.add(new DefaultMutableTreeNode(leafs[2][i], false));
        // Создание стандартной модели
        return new DefaultTreeModel(root);
    }


    @Override
    public void actionPerformed(@NotNull ActionEvent e){

        if (e.getSource()==openItem){
            System.out.println("Open");
        }
        if (e.getSource()==preferenceItem){
            System.out.println("Preference");
        }
        if (e.getSource()==helpItem){
            System.out.println("Help");
        }
    }


    public static void main(String[] args) {
        menu men = new menu();
        men.MenuPage();

    }

}
