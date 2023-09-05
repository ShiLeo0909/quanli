package bai2deA3;

import java.util.Arrays;

public class BasicStatistic implements Statistic {
    private DataSet dataSet;

    /**
     * Hàm dựng khởi tạo tập dữ liệu.
     */
//    public BasicStatistic() {
//
//        // TODO: Khởi tạo đối tượng DataSet (hoặc lớp con của DataSet) cho dataSet
//        Array data = new ArrayDataSet();
//    }

    public BasicStatistic() {
        this.dataSet = new ArrayDataSet();
    }



    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public int size() {
        return dataSet.size();
    }

    @Override
    public double max() {
        double max = dataSet.element(0);
        for (int i = 1; i < dataSet.size(); i++) {
            double element = dataSet.element(i);
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    @Override
    public double min() {
        double min = dataSet.element(0);
        for (int i = 1; i < dataSet.size(); i++) {
            double element = dataSet.element(i);
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    @Override
    public double mean() {
        double sum = 0;
        for (int i = 0; i < dataSet.size(); i++) {
            sum += dataSet.element(i);
        }
        return sum / dataSet.size();
    }

    @Override
    public double variance() {
        double mean = mean();
        double sumOfSquaredDifferences = 0;
        for (int i = 0; i < dataSet.size(); i++) {
            double difference = dataSet.element(i) - mean;
            sumOfSquaredDifferences += difference * difference;
        }
        return sumOfSquaredDifferences / dataSet.size();
    }

    @Override
    public double[] rank() {
        double[] sortedData = dataSet.elements(0, dataSet.size()-1);
        Arrays.sort(sortedData);
        double[] ranks = new double[dataSet.size()];
        int rank = 1;
        int count = 1;
        double sumRank = 0.0;

        for (int i = 0; i < sortedData.length; i++) {
            if (i > 0 && sortedData[i] != sortedData[i - 1]) {
                if (count > 1) {
                    double avgRank = sumRank / count;
                    for (int j = i - count; j < i; j++) {
                        ranks[j] = avgRank;
                    }
                    sumRank = 0.0;
                    count = 1;
                } else {
                    ranks[i - 1] = rank;
                    rank = i + 1;
                }
            } else {
                count++;
            }

            if (i == sortedData.length - 1) {
                if (count > 1) {
                    double avgRank = sumRank / count;
                    for (int j = i - count + 1; j <= i; j++) {
                        ranks[j] = avgRank;
                    }
                } else {
                    ranks[i] = rank;
                }
            }

            sumRank += rank;
        }

        return ranks;
    }

    @Override
    public double median() {
//
        int mid = dataSet.size()/2;
        if(dataSet.size()%2==0){
            return (double) (dataSet.element(mid)+dataSet.element(mid+1))/2;
        }
        return dataSet.element(mid);
    }
}

