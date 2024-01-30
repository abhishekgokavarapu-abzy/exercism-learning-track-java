import java.math.BigInteger;
import java.util.HashMap;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if(square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        HashMap<Integer, BigInteger> resultMap = fillChessSquaresWithGrains();
        return resultMap.get(square);
    }

    BigInteger grainsOnBoard() {
        HashMap<Integer, BigInteger> resultMap = fillChessSquaresWithGrains();
        return resultMap.values().stream().reduce(BigInteger.ZERO, BigInteger::add);
    }

    private HashMap<Integer, BigInteger> fillChessSquaresWithGrains(){
        HashMap<Integer, BigInteger> resultMap = new HashMap<>();
        for (int chessSquareNumber = 1; chessSquareNumber < 65; chessSquareNumber++) {
            BigInteger numberOfGrains = chessSquareNumber == 1 ? BigInteger.ONE : resultMap.get(chessSquareNumber - 1).multiply(BigInteger.TWO);
            resultMap.put(chessSquareNumber,numberOfGrains);
        }
        return resultMap;
    }
}