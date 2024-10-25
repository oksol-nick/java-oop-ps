//package org.oop.commands.menu;
//
//import org.oop.api.ICommand;
//import org.oop.commands.CreateArticleCommand;
//import org.oop.commands.DeleteArticleCommand;
//import org.oop.commands.*;
//import org.oop.api.ICommand;
//
//public class ArticleCommentMenu extends BaseCommand {
//
//    public ArticleCommentMenu() {
//        initializeMenu();
//    }
//
//    private void initializeMenu() {
//        commandSuppliers.put(1, CreateCommentCommand::new);
//        commandSuppliers.put(2, MainMenu::new);
//    }
//
//    @Override
//    public ICommand execute() {
//        return selectMenu();
//    }
//
//
//    @Override
//    public String getDescription() {
//        return "Управление статьями";
//    }
//}
//
//
//
//
//
//
