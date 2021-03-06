package model;

import ai.learner.Learner;
import constant.LearningAlgorithm;
import constant.RunningMode;
import constant.RunningStatus;
import gui.maze.MazeFrame;

/**
 * Created by jvdur on 09/05/2016.
 */
public class GlobalLearningModel {

    private int nbMaze;
    private int nbIterationPerMaze;
    private int mXmin;
    private int mYmin;
    private int mXmax;
    private int mYmax;
    private int mMinLevel;
    private int mMaxLevel;

    private static RunningMode rMode;
    private static RunningStatus rStatus;

    private Learner runningThread;
    private boolean done;
    private static int autoRunningSpeed;
    private LearningAlgorithm algorithm;
    private MlModel runs;
    /*
     *  0 : wait for gui action
     *  1 : is processing
     */
    private boolean solverProcessingState;
    private MazeFrame ninjaFrame;

    public GlobalLearningModel(int nbMaze, int nbIterationPerMaze,
                                int mXmin, int mYmin, int mXmax, int mYmax,
                                int mMinLevel, int mMaxLevel,
                               RunningMode rMode, LearningAlgorithm algo) {
        this.nbMaze = nbMaze;
        this.nbIterationPerMaze = nbIterationPerMaze;
        this.mXmin = mXmin;
        this.mYmin = mYmin;
        this.mXmax = mXmax;
        this.mYmax = mYmax;
        this.mMinLevel = mMinLevel;
        this.mMaxLevel = mMaxLevel;
        this.rMode = rMode;
        this.rStatus = RunningStatus.RUNNING;
        this.setAlgorithm(algo);
        this.runs = new MlModel();

    }


    public int getNbMaze() {
        return nbMaze;
    }

    public int getNbIterationPerMaze() {
        return nbIterationPerMaze;
    }

    public int getmXmin() {
        return mXmin;
    }

    public int getmYmin() {
        return mYmin;
    }

    public int getmXmax() {
        return mXmax;
    }

    public int getmYmax() {
        return mYmax;
    }

    public int getmMinLevel() {
        return mMinLevel;
    }

    public int getmMaxLevel() {
        return mMaxLevel;
    }

    public RunningMode getrMode() {
        return rMode;
    }

    public RunningStatus getrStatus() {
        return rStatus;
    }

    public Learner getRunningThread() {
        return runningThread;
    }

    public static void setrMode(RunningMode rMode) {
        rMode = rMode;
    }

    public static void setrStatus(RunningStatus rStatus) {
        rStatus = rStatus;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean isDone) {
        this.done = done;
    }

    public int getAutoRunningSpeed() {
        return autoRunningSpeed;
    }

    public void setRunningThread(Learner runningThread) {
        this.runningThread = runningThread;
    }

    public LearningAlgorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(LearningAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public boolean isSolverProcessingState() {
        return solverProcessingState;
    }

    public void setSolverProcessingState(boolean solverProcessingState) {
        this.solverProcessingState = solverProcessingState;
    }

    public static void setAutoRunningSpeed(int autoRunningSpeedp) {
        autoRunningSpeed = autoRunningSpeedp;
    }

    public void setNinjaFrame(MazeFrame ninjaFrame) {
        this.ninjaFrame = ninjaFrame;
    }

    public MazeFrame getNinjaFrame() {
        return ninjaFrame;
    }

    public MlModel getRuns() {
        return runs;
    }
}
