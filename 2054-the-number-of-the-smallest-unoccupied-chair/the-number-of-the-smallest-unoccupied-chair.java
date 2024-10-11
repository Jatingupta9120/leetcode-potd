class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
       HashMap<Integer, Integer> realIndexes = new HashMap<>();
        for(int i = 0 ; i < times.length ; i++) {
            int arrivalTime = times[i][0];
            realIndexes.put(arrivalTime, i);
        }
        Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));
        int seatIndex = 0;
        PriorityQueue<List<Integer>> leavingTimes = new PriorityQueue<>((a, b) -> Integer.compare(a.get(1), b.get(1)));
        PriorityQueue<Integer> lastSeats = new PriorityQueue<>();

        for(int i = 0 ; i < times.length ; i++) {

            int arrivalTime = times[i][0];
            int leavingTime = times[i][1];
            int realIndex = realIndexes.get(arrivalTime);
            int currentSeat = seatIndex;

            while(!leavingTimes.isEmpty() && leavingTimes.peek().get(1) <= arrivalTime) {
                lastSeats.add(leavingTimes.poll().get(0));
            }

            if(!lastSeats.isEmpty()) {
                currentSeat = lastSeats.poll();
            } else {
                currentSeat = seatIndex++;
            }

            if(realIndex == targetFriend) {
                return currentSeat;
            }

            leavingTimes.add(new ArrayList<>(Arrays.asList(currentSeat, leavingTime)));
        }
        return 0; 
    }
}