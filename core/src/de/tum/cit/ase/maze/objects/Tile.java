package de.tum.cit.ase.maze.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Tile {
    private TextureRegion tile;
    private TextureRegion orangeTile;
    private TextureRegion islandGrass;
    private TextureRegion water;

    public Tile(){
        loadTile();
        loadOrangeTile();
        loadIslandGrass();
        loadWater();
    }

    public void loadTile()
    {
        Texture wallTexture = new Texture(Gdx.files.internal("basictiles.png"));
        tile = new TextureRegion(wallTexture, 16, 8*16, 16, 16);
    }
    public void loadOrangeTile()
    {
        Texture wallTexture = new Texture(Gdx.files.internal("basictiles.png"));
        orangeTile = new TextureRegion(wallTexture, 0, 16, 16, 16);
    }
    public void loadIslandGrass(){
        Texture wallTexture = new Texture(Gdx.files.internal("Island Tileset.png"));
        islandGrass = new TextureRegion(wallTexture, 0, 0, 27, 24);
    }
    private void loadWater(){
        Texture wallTexture = new Texture(Gdx.files.internal("Island Tileset.png"));
        water = new TextureRegion(wallTexture, 4*27, 7*24, 27, 24);
    }

    public TextureRegion getTile() {
        return tile;
    }

    public TextureRegion getOrangeTile() {
        return orangeTile;
    }

    public TextureRegion getIslandGrass() {
        return islandGrass;
    }

    public TextureRegion getWater() {
        return water;
    }
}
