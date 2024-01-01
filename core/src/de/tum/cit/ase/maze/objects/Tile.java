package de.tum.cit.ase.maze.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Tile {
    private TextureRegion tile;

    public Tile(){
        loadTile();
    }

    public void loadTile()
    {
        Texture wallTexture = new Texture(Gdx.files.internal("basictiles.png"));
        tile = new TextureRegion(wallTexture, 0, 16, 16, 16);
    }

    public TextureRegion getTile() {
        return tile;
    }
}
