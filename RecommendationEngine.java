import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class RecommendationEngine {

    private static final Logger logger = LoggerFactory.getLogger(RecommendationEngine.class);

    public static void main(String[] args) {
        try {
            // Load data from the CSV file
            File dataFile = new File("user_preferences.csv");
            if (!dataFile.exists()) {
                logger.error("Data file not found: " + dataFile.getAbsolutePath());
                return;
            }
            DataModel model = new FileDataModel(dataFile);

            // Define a similarity metric between users
            UserSimilarity similarity = new PearsonCorrelationSimilarity(model);

            // Define a neighborhood of users
            UserNeighborhood neighborhood = new ThresholdUserNeighborhood(0.1, similarity, model);

            // Create a user-based recommender
            UserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

            // Generate recommendations for user with ID 1
            List<RecommendedItem> recommendations = recommender.recommend(1, 3);

            // Print the recommendations
            logger.info("Recommendations for User 1:");
            for (RecommendedItem recommendation : recommendations) {
                logger.info("Item ID: " + recommendation.getItemID() + " | Preference: " + recommendation.getValue());
            }

        } catch (IOException e) {
            logger.error("Error reading data file: " + e.getMessage());
        } catch (TasteException e) {
            logger.error("Error generating recommendations: " + e.getMessage());
        }
    }
}
