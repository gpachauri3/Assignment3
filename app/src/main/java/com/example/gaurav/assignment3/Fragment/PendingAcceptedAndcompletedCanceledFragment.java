package com.example.gaurav.assignment3.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gaurav.assignment3.R;


public class PendingAcceptedAndcompletedCanceledFragment extends Fragment {


    private String mode;
    private TextView tvDispay;
    private static final String PENDING = "pending", COMPLETED = "completed", ACCEPTED = "accepted", CANCELED = "canceled";

    public PendingAcceptedAndcompletedCanceledFragment(final String mode) {
        this.mode = mode;
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup viewGroup, final Bundle savedInstance) {
        View view;
        view = inflater.inflate(R.layout.activity_pending_accepted_andcompleted_canceled_fragment, null);
        tvDispay = (TextView) view.findViewById(R.id.tv_display);

        if ("pending".equals(mode)) {
            tvDispay.setText("Pending");
        } else if ("accepted".equals(mode)) {
            tvDispay.setText("Accepted");
        } else if ("canceled".equals(mode)) {
            tvDispay.setText("Canceled");
        } else {
            tvDispay.setText("Completed");
        }

        return view;
    }

    class InnerPagerAdapter extends FragmentStatePagerAdapter {


        public InnerPagerAdapter(final FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(final int position) {

            if ("upcoming".equals(mode)) {
                switch (position) {
                    case 0:
                        return new PendingAcceptedAndcompletedCanceledFragment(PENDING);
                    case 1:
                        return new PendingAcceptedAndcompletedCanceledFragment(ACCEPTED);
                    default:
                        return null;
                }
            } else {
                switch (position) {
                    case 0:
                        return new PendingAcceptedAndcompletedCanceledFragment(CANCELED);
                    case 1:
                        return new PendingAcceptedAndcompletedCanceledFragment(COMPLETED);
                    default:
                        return null;
                }
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }


}
