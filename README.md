This Java-based program tracks malaria across Ghana, organizing the data based on location. 
It uses data gained from the 2019 Ghana MIS and Ghana Malaria Indicator Trends: 2014-2019.
## Software Development Process

### 1. Object-Oriented Programming
Firstly, I separated the main criteria into classes as a more efficient way of storing information. It was based on the layout used by the Ghana Health Service (GHS), which adds a level of real-world realism to the project. The first class I programmed was Regions, which stores the names of regions in Ghana, their climates (based on Ghana's four major climatic zones), their total populations, and their base relevance. Additionally, I added a boolean value that decided whether or not the region was high risk.
The Municipal Class provides an even deeper look into the statistics, allowing you to look further into each region. It is directly linked to the Regions Class, meaning that each municipality is linked to its parent region.
The MalariaTracker Class is the main class, and it contains the bulk of the information. The  data that will be stored here will be medical case records that use different factors to group patients together.
