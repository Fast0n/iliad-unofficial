package com.fast0n.iliad.ConsumptionDetailsActivity;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import com.fast0n.iliad.R;

public class DataModelChildren extends GroupViewHolder {

    private TextView osName;

    public DataModelChildren(View itemView) {
        super(itemView);

        osName = itemView.findViewById(R.id.mobile_os);
    }

    @Override
    public void expand() {
        osName.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down_arrow, 0);
    }

    @Override
    public void collapse() {
        osName.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up_arrow, 0);
    }

    public void setGroupName(ExpandableGroup group) {
        osName.setText(group.getTitle());
    }
}