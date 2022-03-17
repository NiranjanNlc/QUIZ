package com.application.app.modules.homescreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowHomeScreen1Binding
import com.application.app.modules.homescreen.`data`.model.HomeScreen1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerSelectedandnoAdapter(
  public var list: List<HomeScreen1RowModel>
) : RecyclerView.Adapter<RecyclerSelectedandnoAdapter.RowHomeScreen1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomeScreen1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_screen1,parent,false)
    return RowHomeScreen1VH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeScreen1VH, position: Int): Unit {
    val homeScreen1RowModel = HomeScreen1RowModel()
    // TODO uncomment following line after integration with data source
    // val homeScreen1RowModel = list[position]
    holder.binding.homeScreen1RowModel = homeScreen1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomeScreen1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: HomeScreen1RowModel
    ): Unit {
    }
  }

  public inner class RowHomeScreen1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeScreen1Binding = RowHomeScreen1Binding.bind(itemView)
  }
}
