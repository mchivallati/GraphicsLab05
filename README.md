GraphicsLab05
================================
##Created by Matthew Chivallati
--------------------------------

Main Package:
    `net.franklinps.chivallati`
    
Sub-Package(s):
    `net.franklinps.chivallati.GraphicsLab05`

This Lab consists of the Classes:
- Util (net.franklinps.chivallati)
- LabRunner.java (Runs the Applet)
- Frame.java
- Box.java
- Present.java
- Tree.java
- ChristmasTree.java
- TreeTrunk.java
- TreeLeaves.java

####Objective
- To gain a better understanding of class interaction using examples of composition and inheritance

####Program Elements
- [x] Box Class
- [x] Present Class
- [x] Tree Classes
    - [x] Tree Class
    - [x] TreeLeaves Class
    - [x] TreeTrunk Class
    - [x] ChristmasTree Class

--------------------------------

###Class Interaction

#####Inheritance
- LabRunner *is-a* Applet
- Present *is-a* Box
- ChristmasTree *is-a* Tree

#####Composition
- A present *has-a* wrapping
- A tree *has-a* trunk
- A tree *has* leaves
- LabRunner *has-a* Frame
