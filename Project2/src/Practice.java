
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

// class SupervisedLearning extends MachineLearning {

// }

// class UnsupervisedLearning extends MachineLearning {

// }

public class Practice {
    public static void main(String[] args) throws Exception {

        MachineLearning data1 = new MachineLearning();

        data1.dataType = "Labeled";

        data1.modelSelection(data1.dataType);

    }
}
