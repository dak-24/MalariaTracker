This Java-based program tracks malaria across Ghana, organizing the data based on location. 
It uses data gained from the 2019 Ghana MIS, Ghana Malaria Indicator Trends: 2014-2019, and the Ghana Statistical Service National Data Archive (statsghana.gov.gh).
# Software Development Process

## 1. Object-Oriented Programming
Firstly, I separated the main criteria into classes as a more efficient way of storing information. It was based on the layout used by the Ghana Health Service (GHS), which adds a level of real-world realism to the project. The first class I programmed was Regions, which stores the names of regions in Ghana, their climates (based on Ghana's four major climatic zones), their total populations, and their base relevance. Additionally, I added a boolean value that decided whether or not the region was high risk.
The Municipal Class provides an even deeper look into the statistics, allowing you to look further into each region. It is directly linked to the Regions Class, meaning that each municipality is linked to its parent region.
The MalariaTracker Class is the main class, and it contains the bulk of the information.

## 2. Securing Variables
I turned the variables in both classes private so that they could be properly encapsulated. Then, I added a setter for baseRelevance so that even if the values changed, the program would automatically evaluate whether or not the value is high risk. For the highRisk variable, I set the boolean value to be true only when baseRelevance is 0.15 or greater.

## 3. Get Setters
Get setters were added to allow the main class safe access to variables in the Regions and Municipal classes.
