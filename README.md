I. Project Overview

The objective of the Sprout scout: Community Plant Tracker is to provide a console-based application that allows users to manage and monitor their community or personal garden effectively. The program enables users to add plant details, view comprehensive plant information, and receive reminders for watering schedules. This application serves as a simple yet practical tool to encourage plant care and community engagement.
Key Features:
1.	Add a Plant:
•	Users can add two types of plants:
•	Flowering Plants (e.g., roses, tulips)
•	Vegetable Plants (e.g., tomatoes, carrots)
•	Each plant entry includes details like the plant's name, growth stage, water interval, and additional type-specific attributes (e.g., flower color or harvest season).

2.	View All Plants:
•	Displays all the plants added by the user, along with their specific details.

3.	Watering Reminders:
•	Provides timely reminders based on the watering interval set for each plant.

4.	Exit Option:
•	Allows the user to quit the application gracefully after completing their tasks.
________________________________________
II. Explanation of How OOP Principles Were Applied
The Sprout Scout systemp utilizes key Object-Oriented Programming (OOP) principles, which include:

1. Encapsulation
In the real world, managing sensitive or important data, such as plant care schedules, requires ensuring that the data is protected from unauthorized access or changes. Encapsulation in Sprout Scout mirrors this need for control in the real world, especially in areas like:
•	Personal Plant Care:
Users may not want random individuals to modify their plant data. By encapsulating plant attributes like name, water interval, and growth stage, the application ensures that only authorized methods (through getters and setters) can change these properties. This mirrors how people manage their private garden logs or plant care routines—only specific actions can alter plant care details.

2. Inheritance
Inheritance in OOP allows for the reuse of code and makes it easier to manage different plant types while maintaining common behavior. In Sprout Scout, inheritance reflects real-world categories or classifications of plants, which share core characteristics but differ in specific ways.
•	Plant Classification:
Real-world gardeners often categorize plants into different types (e.g., flowering plants, vegetables, trees, shrubs). In Sprout Scout, the FloweringPlant and VegetablePlant classes inherit from the abstract Plant class, representing these real-world 
classifications. This allows the program to manage these plant types with minimal redundancy, similar to how horticulturists use broad categories to manage plant care.

3. Polymorphism
Polymorphism allows the program to handle different plant types with the same method while providing specific behavior based on the actual object type. In Sprout Scout, polymorphism reflects the real-world scenario of handling multiple plant types in a garden, each requiring different care.
•	Flexible Plant Care:
Just as a gardener knows that different plants need specific care (e.g., flowering plants may require more frequent watering, vegetables need harvest reminders), Sprout Scout uses polymorphism to handle these varying needs through a unified interface (like getDetails() and getReminder()). The same method can give different outputs for different plant types, making it easy to manage multiple plants with diverse care needs without separate code for each one.

4. Abstraction
Abstraction helps in focusing on what needs to be done while hiding unnecessary details. In Sprout Scout, the Plant class provides a simple interface to interact with plants, while the details of the plant’s specific characteristics (e.g., flower color, harvest season) are handled by the subclasses. This simplifies the user's experience, as they interact with the broad concept of a "plant" without needing to understand or manage the internal workings of each specific plant type.
•	Simplified User Interaction:
In the real world, people dont need to understand all the complexities of plant biology to take care of their plants. By using abstraction, Sprout Scout simplifies plant tracking by providing a common interface (e.g., getDetails(), getReminder()) while leaving the specifics (e.g., flowerColor, harvestSeason) to the subclasses. This abstraction ensures users can focus on general plant care while the app handles specific details behind the scenes.
________________________________________
III. Details of the Chosen SDG and Its Integration into the Project
The Sprout Scout system supports SDG 15 by fostering awareness and practices that align with sustainable land management and biodiversity conservation. Here's how it integrates the SDG:

1. Encouraging Plant Care and Biodiversity:
•	By tracking and maintaining different plant types, such as flowering and vegetable plants, the project promotes biodiversity within communities.
•	Encouraging users to nurture a variety of plants contributes to ecological balance and helps sustain the local environment.

2. Promoting Community Engagement:
•	Sprout Scout emphasizes community involvement, encouraging collective responsibility for gardens and green spaces.
•	A shared tracking tool fosters collaboration, creating a sense of ownership among participants in maintaining plants and ecosystems.

3. Water Management:
•	The watering reminders feature ensures plants are cared for without overuse of water resources, promoting sustainable water use—a critical aspect of combating desertification.

4. Raising Awareness:
•	Through its detailed plant tracking features, the application educates users about specific plant care needs, helping them understand how to nurture plants effectively.
•	This knowledge can inspire users to expand their green practices beyond individual plants to broader sustainability initiatives.

5. Supporting Local Food Systems:
•	Vegetable plants included in the tracker encourage users to grow their food, reducing reliance on unsustainable agricultural practices.
•	This directly supports biodiversity and reduces the environmental footprint associated with food production.
________________________________________
IV. Instructions for Running the Program
To run the Sprout Scout - Community Plant Tracker program, follow these steps:

1. Running the Program
Before running the program, ensure there are no errors and that it has been compiled correctly. Once the program is ready:
•	Launch the Program:
Run the program by executing the compiled .class file using the Java command:
java SproutSCout

2. Enter Your Command Choice
Once the program is running, the console will display the main menu with several options. These options are for managing and tracking your plants. Here's a breakdown of each option:
Add a Plant
•	When you select this option, the program will guide you through adding a plant to the tracker.
•	You will be prompted to choose a plant type:
•	Flowering Plant: Youll need to enter details like the plants name, growth stage, watering interval, and flower color.
•	Vegetable Plant: Youll need to enter details like the plants name, growth stage, watering interval, and harvest season.
View All Plants
•	This option displays all the plants added to the tracker.
•	It will show detailed information for each plant, such as the plant's name, growth stage, watering interval, and for flowering plants, the flower color, or for vegetable plants, the harvest season.
Get Watering Reminders
•	When you select this option, the program will display watering reminders for all the plants in the tracker.
•	It will tell you when each plant should be watered based on the intervals you provided when adding the plant.
Exit
•	Selecting this option will exit the program.
•	A message "Goodbye!" will be shown, and the program will terminate, sending you back to your terminal or command prompt.
Exit the Program
•	When you choose the "Exit" option, the program will terminate and close the console application.
•	If you want to run the program again, simply execute the java CommunityPlantTracker command again.

3. Troubleshooting
•	Program Not Running Correctly:
•	Ensure the program is compiled correctly with javac. If you encounter errors, check for any syntax issues or missing semicolons.
•	Invalid Inputs:
•	Make sure to enter valid values when prompted. For instance, if asked for a number of days for watering, enter an integer value.
By following these steps, you should be able to interact with the Sprout Scout program and efficiently manage your plants.

