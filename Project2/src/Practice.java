
class MachineLearning {

    String dataType; // labeled or unlabeled

    public void modelSelection(String dataType) {
        if ((dataType == "Labeled") || (dataType == "labeled")) {
            System.out.println("Use Supervised Learning");

        } else if ((dataType == "Unlabeled") || (dataType == "unlabeled")) {
            System.out.println("Use Unsupervised Learning");

        } else {
            System.out.println("Wrong Value Type");
        }
    }

}

class SupervisedLearning extends MachineLearning {
    String modelType; // Regression or classification

    public void algorithm(String modelType) {
        if ((modelType == "regression") || (modelType == "Regression")) {
            System.out.println("Apply Linear Regression");
        } else if ((modelType == "classification") || (modelType == "Classification")) {
            System.out.println("Apply ANN, SVM, or Logistic Regression");
        } else {
            System.out.println("Wrong model type");
        }
    }

}

class UnsupervisedLearning extends MachineLearning {
    String modelType; // Clustering or non clustering

    public void algorithm(String modelType) {
        if ((modelType == "clustering") || (modelType == "Clustering")) {
            System.out.println("Apply K-Means");
        } else if ((modelType == "nonClustering") || (modelType == "nonclustering")) {
            System.out.println("Still learning...so no idea about which algorithm to use");
        } else {
            System.out.println("Wrong model type");
        }
    }
}

public class Practice {
    public static void main(String[] args) throws Exception {

        MachineLearning data1 = new MachineLearning();
        MachineLearning data2 = new MachineLearning();

        data1.dataType = "Labeled";
        data2.dataType = "unlabeled";

        data1.modelSelection(data1.dataType);
        data1.modelSelection(data2.dataType);

        SupervisedLearning sl1 = new SupervisedLearning();
        SupervisedLearning sl2 = new SupervisedLearning();

        sl1.modelType = "regression";
        sl2.modelType = "classification";

        sl1.algorithm(sl1.modelType);
        sl1.algorithm(sl2.modelType);

        UnsupervisedLearning ul1 = new UnsupervisedLearning();
        UnsupervisedLearning ul2 = new UnsupervisedLearning();

        ul1.modelType = "Clustering";
        ul2.modelType = "nonclustering";

        ul1.algorithm(ul1.modelType);
        ul2.algorithm(ul2.modelType);

    }
}
