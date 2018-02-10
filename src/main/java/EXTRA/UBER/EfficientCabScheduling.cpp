#include<stdio.h>
#include<vector>
#include<map>
#include<utility>
#include<algorithm>
#include<set>
#include<string>
#include<string.h>
#include<time.h>
#include<iostream>
#include<queue>
#include<stack>
#include<math.h>

#define LL long long
#define REP(i,a,b) for(i=a;i<=b;i++)

using namespace std;

LL ar[1000006];

int main() {
    LL i,j,k,l,n,m,t;
    cin >> n >> k;
    for(i=0;i<k;i++) {
        cin >> ar[i];
    }
    LL sm,la;
    sm = 0;
    la = 2000000L * 1000000L;

    while (sm < la) {
        if (la - sm <= 3) {
            break;
        }
        LL mid = (sm+la)/2;
        m = 0;
        for (i=0;i<k;i++) {
            m += (mid/ar[i]);
        }
        if (m == n) {
            sm = mid;
            break;
        }
        if (m < n) {
            sm = mid + 1;
        }
        else {
            la = mid;
        }
    }

    for (j = sm; j <= la; j++) {
        m = 0;
        for (i=0;i<k;i++) {
            m += (j/ar[i]);
        }
        if (m >= n) {
            break;
        }
    }

    cout << j << endl;

    return 0;
}