#AI-BASED RECOMMENDATION SYSTEM

*COMPANY*: CODETECH IT SOLUTIONS

*NAME*: SHIVANGI SHARMA

*INTERN ID*: CT08RVQ

*DOMAIN*: JAVA

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

#This project is a user-based recommendation system implemented in Java using Apache Mahout. The system analyzes user preferences from a structured dataset and generates personalized recommendations based on collaborative filtering techniques. It leverages Pearson Correlation Similarity to identify users with similar preferences and suggest relevant items.

The system reads user preference data from a CSV file, which contains ratings assigned by different users to various items. Using Apache Mahout’s FileDataModel, the data is loaded into a structured format, ensuring efficient processing and retrieval. The program first checks if the file exists and logs an error message if it is missing, preventing execution failures due to missing data.

To compute user similarity, the system utilizes the Pearson Correlation Similarity metric, which measures how closely related users' preferences are based on their ratings. A higher similarity score between two users indicates that they share similar tastes, making it possible to predict the likelihood of a user liking an item based on other similar users' preferences.

Once the similarity between users is established, the system defines a user neighborhood using a ThresholdUserNeighborhood approach. This method groups users whose similarity scores exceed a defined threshold (0.1 in this case), ensuring that only users with significant similarity contribute to the recommendation process. The neighborhood concept is critical in collaborative filtering, as recommendations are derived from users with similar tastes.

The core recommendation model is built using GenericUserBasedRecommender, a Mahout implementation that employs user-based collaborative filtering to generate recommendations. The model is configured to suggest items for a specific user (User 1) based on preferences expressed by other users in the defined neighborhood. The system then produces a ranked list of recommended items, each associated with a predicted preference score.

To ensure seamless execution, the program incorporates exception handling to manage errors that may arise during file reading, data processing, or recommendation generation. IOException is handled when issues occur while accessing the dataset, while TasteException is managed for errors related to recommendation computations. These safeguards enhance the program’s robustness, preventing unexpected crashes due to missing files or corrupted data.

The system logs the recommendations using SLF4J logging, providing a structured output that includes the recommended item ID and its predicted preference score. This approach ensures clarity in presenting results and allows further analysis of the recommendations generated.

Key Features:
User-Based Collaborative Filtering: Utilizes similarity-based recommendations to suggest items.
Pearson Correlation Similarity: Calculates user similarity based on preference data.
Neighborhood-Based Recommendations: Forms a neighborhood of similar users to enhance recommendation accuracy.
Efficient Data Handling: Uses Apache Mahout’s FileDataModel for structured data processing.
Robust Exception Handling: Prevents execution failures due to missing files or invalid data.
Scalability: Can be extended to support larger datasets and more advanced filtering techniques.
Technologies Used:
Java (Core implementation and data handling)
Apache Mahout (Collaborative filtering and similarity computation)
SLF4J Logging (Structured logging of recommendations)
This project showcases expertise in machine learning, recommendation systems, data processing, and Java-based application development, making it a strong addition to a resume in data science, artificial intelligence, or software engineering.

OUTPUT

![Image](https://github.com/user-attachments/assets/98c3d6b9-1fa5-461d-bd15-06b81d4b11fd)
