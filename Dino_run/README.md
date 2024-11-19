Dino_run

This Python code implements a simple game inspired by the classic Flappy Bird.  The player controls a dinosaur that must navigate through an endless landscape avoiding obstacles like cacti and birds.
Getting Started

This game requires the following Python libraries:

    pygame
    os
    random

You can install them using the pip command:
Bash

pip install pygame os random

Use code with caution.
Code Structure

The code is organized into several parts:

    Imports: The necessary libraries are imported at the beginning.
    Functions:
        load_image(path): Loads an image from the specified path.
        main(): The main function that runs the game loop.
        menu(death_count): Displays the game menu screen.
    Classes:
        Dinosaur: Represents the playable dinosaur character.
        Cloud: Represents a moving cloud in the background.
        Obstacle (Base Class): Defines the basic structure for obstacles.
        SmallCactus, LargeCactus, Bird: Inherit from Obstacle and represent specific obstacle types.

Gameplay

Use the arrow keys to control the dinosaur:

    Up arrow: Makes the dinosaur jump.
    Down arrow: Makes the dinosaur duck.
    No key pressed: Makes the dinosaur run.

The objective is to avoid colliding with obstacles while collecting points. Points are awarded as the dinosaur progresses through the game. The game ends when the dinosaur collides with an obstacle.
Running the Game

    Save the code as a Python file (e.g., flappy_dino.py).
    Open a terminal or command prompt and navigate to the directory where you saved the file.
    Run the game using the following command:

Bash

python dino_run.py

