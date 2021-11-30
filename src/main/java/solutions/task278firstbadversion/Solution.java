package solutions.task278firstbadversion;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/* I am not using the VersionControl until I catch how to test such cases */

public class Solution extends VersionControl {
    public int firstBadVersion(int n, int bad) {
        int minVersion = 1;
        int maxVersion = n;
        int currentVersion = minVersion;
        int badVersion = bad;

        while (minVersion < maxVersion) {
            currentVersion = minVersion / 2 + maxVersion / 2;

            if (currentVersion == badVersion) {
                maxVersion = currentVersion;
            } else {
                minVersion = currentVersion + 1;
            }
        }

        return minVersion;
    }
}
