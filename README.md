# MazeRunnerGame

## Overview
MazeRunnerGame is a 2D adventure puzzle game developed in Java using the LibGDX framework. Set in a series of increasingly complex mazes, players must navigate through various challenges, avoiding enemies, overcoming obstacles, and solving puzzles to progress through levels.

## Features
- **Multiple Levels**: Varied maze designs with unique layouts and increasing difficulty.
- **Character Animations**: Smooth and engaging animations for player and enemy movements.
- **Interactive Elements**: Keys for unlocking doors, hearts for gaining lives, and obstacles like spikes and fire.
- **Dynamic Collision Handling**: Intelligent collision detection and response for immersive gameplay.
- **HUD**: Displays player stats like health and items collected.
- **Pause and Resume**: Ability to pause the game and resume from the last state.
- **Sound Effects**: Immersive audio experience with background music and sound effects.

## Getting Started
### Prerequisites
- Java JDK 7 or later.
- Latest version of LibGDX framework.
- Gradle for building the project.

### Installation
1. Clone the Repository
2. Navigate to the project directory:
3. Build the project using Gradle:
```shell
./gradlew build
```


### Running the Game
Execute the following command in the project directory:
```shell
./gradlew run
```


## Project Structure
- `core/src/de/tum/cit/ase/maze`: Main game package.
    - `characters`: Contains player and enemy character classes.
    - `objects`: Game objects like keys and hearts.
    - `screens`: Game screens like the main menu, game screen, etc.
    - `Utils.java`: Utility functions for the game.
    - `MapLoader.java`: Handles loading and rendering of game maps.
    - `EventHandler.java`: Manages game events and interactions.
- `assets`: Contains game assets like images and sound files.
- `desktop/src`: Desktop launcher for the game.

## Controls
- Arrow keys or WASD for player movement.
- ESC to pause the game.

## Documentation
- The [JavaDoc documentation](doc/index.html) for this project can be found [here](doc/index.html).
- The UML diagram for this project can be found [here](https://www.figma.com/file/LgbfVA646i5ApL4H32CD35/UML?type=whiteboard&node-id=0%3A1&t=xPXanqFMPSHzNOUv-1)
