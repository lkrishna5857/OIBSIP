dispose(); // Close the exam interface
                Login loginForm = new Login();
                loginForm.setSize(400, 150);
                loginForm.setVisible(true);
            }
        } else {
            for (int i = 0, y = 1; i < x; i++, y++) {
                if (e.getActionCommand().equals("Review" + y)) {
                    if (check())
                        count = count + 1;
                    now = current;
                    current = m[y];
                    set();
                    ((JButton) e.getSource()).setEnabled(false);
                    current = now;
                }
            }
        }
    }

    void set() {
        jb[4].setSelected(true);
        if (current == 0) {
            l.setText("Que1: Who invented java programming ?");
            jb[0].setText("Charles Babbage");
            jb[1].setText("James Gosling");
            jb[2].setText("M.P. Java");
            jb[3].setText("Blais Pascal");
        } else if (current == 1) {
            l.setText("Que2:which of these are selection statements in java  ?");
            jb[0].setText("break");
            jb[1].setText("contiue");
            jb[2].setText("for()");
            jb[3].setText("if()");
        } else if (current == 2) {
            l.setText("Que3: Where is the system class defined?");
            jb[0].setText("java.lang.package");
            jb[1].setText("java.util.package");
            jb[2].setText("java.lo.package");
            jb[3].setText("None");
        }
else if(current==3)
{
l.setText("Ques4:which of the folloing is not a java feature?");
jb[0].setText("object-oriented");
jb[1].setText("Use of pointers");
jb[2].setText("Portable");
jb[3].setText("dynamic");
}
else if(current==4)
{
l.setText("Ques5:which of these cannot be used for a variable name in java?");
jb[0].setText("identifer and keyword");
jb[1].setText("identifer");
jb[2].setText("keyword");
jb[3].setText("None");
}
else if(current ==5)
{
 l.setText("Ques 6:what is the extension of java code file");
jb[0].setText(".js");
jb[1].setText(".txt");
jb[2].setText(".class");
jb[3].setText(".java");
}
else if(current ==6)
{
l.setText("Ques7:Which of the following is not a OOPS concept?");
jb[0].setText("Polymorphism");
jb[1].setText("Inheritance");
jb[2].setText("Compilation");
jb[3].setText("Encapsulation");
}
else if(current ==7)
{
l.setText("Ques8:which of the following keyord is used for define the interfaces in java?");
jb[0].setText("Inf");
jb[1].setText("Intf");
jb[2].setText("interface");
jb[3].setText("Interface");
}
else if(current ==8)
{
l.setText("Ques9:which of the following is a superclass of every class in java");
jb[0].setText("Arraylist");
jb[1].setText("Abstract class");
jb[2].setText("Object class");
jb[3].setText("String");
}
else if (current ==9)
{
l.setText("Ques10:which of these keywords are used for the block to be examined for exceptions");
jb[0].setText("check");
jb[1].setText("throw");
jb[2].setText("catch");
jb[3].setText("try");
}

              l.setBounds(30, 40, 450, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++)
            jb[j].setBounds(50, 80 + i, 200, 20);
    }

    boolean check() {
        // Code for checking the selected answer
if (current == 0)
            return (jb[1].isSelected());
        if (current == 1)
            return (jb[3].isSelected());
        if (current == 2)
            return (jb[2].isSelected());
if(current ==3)
   return(jb[1].isSelected());
        if (current == 4)
            return (jb[2].isSelected());
        if (current == 5)
            return (jb[3].isSelected());
        if (current == 6)
            return (jb[2].isSelected());
        if (current == 7)
            return (jb[2].isSelected());
        if (current == 8)
            return (jb[2].isSelected());
        if (current == 9)
            return (jb[3].isSelected());

        return false;
    
    }

    String formatTime(int seconds) {
        int minutes = seconds / 60;
        seconds %= 60;
        return String.format("%02d:%02d", minutes, seconds);
    }

    void showResult() {
        timer.stop();
        JOptionPane.showMessageDialog(this, "Score = " + count);
        System.exit(0);
    }
}

class OnlineExam {
    public static void main(String args[]) {
        try {
            Login form = new Login();
            form.setSize(400, 400);
            form.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
