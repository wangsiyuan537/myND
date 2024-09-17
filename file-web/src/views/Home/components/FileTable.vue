<template>
  <el-table :data="tableData" style="width: 100%" loading="loading">
    <el-table-column prop="fileName" label="文件名"> </el-table-column>
    <!-- 通过 v-if 来控制 类型 列是否显示 -->
    <el-table-column
        prop="extendName"
        label="类型"
        width="100"
        v-if="selectedColumnList.includes('extendName')"
    >
    </el-table-column>
    <!-- 通过 v-if 来控制 大小 列是否显示 -->
    <el-table-column
        prop="fileSize"
        label="大小"
        width="60"
        v-if="selectedColumnList.includes('fileSize')"
    >
    </el-table-column>
    <!-- 通过 v-if 来控制 修改日期 列是否显示 -->
    <el-table-column
        prop="uploadTime"
        label="修改日期"
        width="180"
        v-if="selectedColumnList.includes('uploadTime')"
    >
    </el-table-column>
    <el-table-column :width="operaColumnIsFold ? 200 : 100">
      <template slot="header">
        <span>操作</span>
        <i
            class="el-icon-circle-plus"
            title="展开"
            @click="operaColumnIsFold = true"
        ></i>
        <i
            class="el-icon-remove"
            title="折叠"
            @click="operaColumnIsFold = false"
        ></i>
      </template>
      <template slot-scope="scope">
        <!-- 操作列展开状态下的按钮 -->
        <div class="opera-unfold" v-if="operaColumnIsFold">
          <el-button
              type="text"
              size="small"
              @click.native="handleClickDelete(scope.row)"
          >删除</el-button
          >
          <el-button
              type="text"
              size="small"
              @click.native="handleClickMove(scope.row)"
          >移动</el-button
          >
          <el-button
              type="text"
              size="small"
              @click.native="handleClickRename(scope.row)"
          >重命名</el-button
          >
          <el-button type="text" size="small">
            <a target="_blank" style="display: block; color: inherit">下载</a>
          </el-button>
        </div>
        <!-- 操作列收缩状态下的按钮 -->
        <el-dropdown trigger="click" v-else>
          <el-button size="mini">
            操作
            <i class="el-icon-arrow-down el-icon--right"></i>
          </el-button>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item @click.native="handleClickDelete(scope.row)"
            >删除</el-dropdown-item
            >
            <el-dropdown-item @click.native="handleClickMove(scope.row)"
            >移动</el-dropdown-item
            >
            <el-dropdown-item @click.native="handleClickRename(scope.row)"
            >重命名</el-dropdown-item
            >
            <el-dropdown-item>
              <a target="_blank" style="display: block; color: inherit">下载</a>
            </el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
      </template>
    </el-table-column>
  </el-table>
</template>

<script>
export default {
  name: 'FileTable',
  props: {
    // 表格数据，同时需要删除原本在 data( return { } ) 中的 tableData，否则会报错
    tableData: {
      type: Array,
      required: true
    },
    // 表格加载状态
    loading: {
      type: Boolean,
      required: true
    }
  },
  data() {
    return {
      operaColumnIsFold: sessionStorage.getItem('operaColumnIsFold') || false //  表格操作列-是否收缩
    }
  },
  methods: {
    // 删除按钮 - 点击事件
    handleClickDelete(row) {
      console.log("删除", row.fileName);
    },
    // 移动按钮 - 点击事件
    handleClickMove(row) {
      console.log("移动", row.fileName);
    },
    // 重命名按钮 - 点击事件
    handleClickRename(row) {
      console.log("重命名", row.fileName);
    },
  },
  watch: {
    // 监听收缩状态变化，存储在sessionStorage中，保证页面刷新时仍然保存设置的状态
    operaColumnIsFold(newValue) {
      sessionStorage.setItem('operaColumnIsFold', newValue)
    }
  },
  created() {
    this.operaColumnIsFold = sessionStorage.getItem('operaColumnIsFold') === 'true' //  读取保存的状态
  },
  computed: {
    // 表格显示列
    selectedColumnList() {
      return this.$store.getters.selectedColumnList
    }
  },
};
</script>

<style lang="stylus" scoped>
// 表格操作列-表头图标样式调整
.el-icon-circle-plus, .el-icon-remove {
  margin-left: 8px;
  cursor: pointer;
  font-size: 16px;

  &:hover {
    opacity: 0.5;
  }
}
</style>