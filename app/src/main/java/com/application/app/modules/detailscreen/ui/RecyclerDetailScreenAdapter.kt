package com.application.app.modules.detailscreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowDetailScreen1Binding
import com.application.app.modules.detailscreen.`data`.model.DetailScreen1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerDetailScreenAdapter(
  public var list: List<DetailScreen1RowModel>
) : RecyclerView.Adapter<RecyclerDetailScreenAdapter.RowDetailScreen1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDetailScreen1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_detail_screen1,parent,false)
    return RowDetailScreen1VH(view)
  }

  public override fun onBindViewHolder(holder: RowDetailScreen1VH, position: Int): Unit {
    val detailScreen1RowModel = DetailScreen1RowModel()
    // TODO uncomment following line after integration with data source
    // val detailScreen1RowModel = list[position]
    holder.binding.detailScreen1RowModel = detailScreen1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DetailScreen1RowModel>): Unit {
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
      item: DetailScreen1RowModel
    ): Unit {
    }
  }

  public inner class RowDetailScreen1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDetailScreen1Binding = RowDetailScreen1Binding.bind(itemView)
  }
}
