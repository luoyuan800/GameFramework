package com.smarticle.framework;

import com.smarticle.framework.Graphics.PixmapFormat;

public interface Pixmap {

	public int getWidth();

	public int getHeight();

	public PixmapFormat getFormat();

	public void dispose();

}
