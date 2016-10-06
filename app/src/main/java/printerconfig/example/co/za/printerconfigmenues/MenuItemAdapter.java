/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package printerconfig.example.co.za.printerconfigmenues;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MenuItemAdapter extends RecyclerView.Adapter<MenuItemAdapter.MyViewHolder> {

    private List<CustomMenuItem> customMenuItems;

    public MenuItemAdapter(List<CustomMenuItem> customMenuItems){
        this.customMenuItems = customMenuItems;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView description;
        public ImageView icon;

        public MyViewHolder(View view) {
            super(view);
            description = (TextView) view.findViewById(R.id.description);
            icon = (ImageView) view.findViewById(R.id.menu_icon);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.menu_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        CustomMenuItem item = customMenuItems.get(position);
        holder.description.setText(item.getDescription());
        holder.icon.setImageResource(item.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return customMenuItems.size();
    }

}
