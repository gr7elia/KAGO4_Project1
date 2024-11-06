package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert ein Haus. Der Teil mit "extends" wird später erklärt und jetzt ignoriert - oder wurde schon erklärt.
 */
public class House extends GraphicalObject {

    /**
     * Erzeugt ein neues Objekt der Klasse House
     */
    public House(){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }


    /**
     * Diese Methode zeichnet den die optische Repräsentation eines House-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        //HAUS
        drawTool.setCurrentColor(Color.DARK_GRAY);
        drawTool.drawFilledRectangle(150, 300, 200, 240);
        //TÜR
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawFilledRectangle(230,479,50,60);
        //FENSTER
        drawTool.setCurrentColor(Color.LIGHT_GRAY);
        drawTool.drawFilledRectangle(285,350,40,40);
        drawTool.setCurrentColor(Color.LIGHT_GRAY);
        drawTool.drawFilledRectangle(180,350,40,40);
        //FENSTERRAHMEN
        drawTool.setLineWidth(3);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawRectangle(285,350,40,40);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawRectangle(180,350,40,40);
        //FENSTERKREUZ
        drawTool.drawLine(285,370,325,370);
        drawTool.drawLine(305,350,305,390);
        drawTool.drawLine(180,370,220,370);
        drawTool.drawLine(200,350,200,390);

    }

    /**
     * Wird mit jedem Frame vom Framework aufgerufen und dient zur Manipulation des Objekts im Verlauf
     * der Zeit.
     * @param dt die Sekunden, die seit dem letzten Aufruf von update vergangen sind
     */
    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }

}
