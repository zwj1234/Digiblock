/*
 * Copyright (c) 2016 Helmut Neemann
 * Use of this source code is governed by the GPL v3 license
 * that can be found in the LICENSE file.
 */
package de.neemann.digiblock.builder.circuit;

import de.neemann.digiblock.core.flipflops.FlipflopJK;
import de.neemann.digiblock.draw.graphics.Vector;
import de.neemann.digiblock.draw.library.ElementLibrary;
import de.neemann.digiblock.draw.shapes.ShapeFactory;
import junit.framework.TestCase;

import static de.neemann.digiblock.draw.shapes.GenericShape.SIZE;

/**
 */
public class FragmentVisualElementTest extends TestCase {

    public void testBox() throws Exception {
        ShapeFactory shapeFactory = new ShapeFactory(new ElementLibrary());
        FragmentVisualElement ve = new FragmentVisualElement(FlipflopJK.DESCRIPTION,shapeFactory);
        ve.setPos(new Vector(0,0));
        Box box = ve.doLayout();
        assertEquals(SIZE*3, box.getHeight());
        assertEquals(SIZE*3, box.getWidth());
    }
}
