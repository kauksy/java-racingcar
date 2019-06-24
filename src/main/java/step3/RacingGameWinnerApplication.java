package step3;

class RacingGameWinnerApplication {

    private InputView input;

    protected RacingGameWinnerApplication() {
        this.input = new InputView();
    }

    public static void main(String[] args) {

        RacingGameWinnerApplication app = new RacingGameWinnerApplication();

        String[] carName = app.input.inputCarName();
        int carNumber = carName.length;
        int tryCount = app.input.inputTryCount();

        RacingGameWinner racingGameWinner = new RacingGameWinner();
        racingGameWinner.setInitPosition(carNumber);

        System.out.println("실행결과");

        while (tryCount-- > 0) {
            racingGameWinner.startRacing(carNumber);
            racingGameWinner.racingView(carName);
        }
        racingGameWinner.findMaxScoreWinner(carName);
    }
}
