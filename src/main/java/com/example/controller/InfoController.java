package com.example.controller;

import com.example.DTO.InfoDTO;
import com.example.common.ApiResult;
import com.example.entity.Info;
import com.example.service.InfoService;
import com.example.util.StringUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @ApiOperation(value = "查询用户信息", notes = "用户信息")
    @PostMapping("/getAll")
    public ApiResult getAll() {
        ApiResult apiResult = new ApiResult();
        if (StringUtils.isNotNullNorEmpty(infoService.selectAll().toString())) {
            apiResult.setCode(200);
            apiResult.setData(infoService.selectAll());
        } else {
            apiResult.setCode(500);
            apiResult.setException("系统异常");
        }
        return apiResult;
    }

    @ApiOperation(value = "多条件查询用户信息", notes = "用户信息")
    @PostMapping("/getAlls")
    public ApiResult getAlls(@RequestBody Info info) {
        ApiResult apiResult = new ApiResult();
        if (StringUtils.isNotNullNorEmpty(infoService.selectAlls(info).toString())) {
            apiResult.setCode(200);
            apiResult.setData(infoService.selectAlls(info));
        } else {
            apiResult.setCode(500);
            apiResult.setException("系统异常");
        }
        return apiResult;
    }

  /*  @ApiOperation(value = "增加用户信息", notes = "增加")
    @PostMapping("/insert")
    public ApiResult insert(@RequestBody Info info) {
        ApiResult apiResult = new ApiResult();
        if (StringUtils.isNotNullNorEmpty(info.toString())) {
            apiResult.setCode(200);
            apiResult.setData(infoService.insertSelective(info));
        } else {
            apiResult.setCode(500);
            apiResult.setException("系统异常");
        }
        return apiResult;
    }
*/

    @ApiOperation(value = "删除用户信息", notes = "删除")
    @PostMapping("/delete")
    public ApiResult deleteAll(@RequestParam Integer id) {
        ApiResult apiResult = new ApiResult();

        int num = infoService.delete(id);
        if (num > 0) {
            apiResult.setCode(200);
            apiResult.setData(num);
        } else {
            apiResult.setCode(500);
            apiResult.setException("系统异常");
        }
        return apiResult;
    }

    @ApiOperation(value = "批量删除用户信息", notes = "删除")
    @PostMapping("/deleteAll")
    public ApiResult deleteAll(@RequestBody List<InfoDTO> list) {
        ApiResult apiResult = new ApiResult();
        int num = infoService.deleteAll(list);
        apiResult.setCode(200);
        apiResult.setData(num);
        return apiResult;
    }


    @ApiOperation(value = "添加用户信息", notes = "删除")
    @PostMapping("/insert")
    public ApiResult insert(@RequestBody Info info) {
        ApiResult apiResult = new ApiResult();
        int num = infoService.insert(info);
        apiResult.setData(num);
        return apiResult;
    }

    @ApiOperation(value = "批量更新用户信息", notes = "批量更新")
    @PostMapping("/update")
    public ApiResult update(@RequestBody List<Info> info) {
        ApiResult apiResult = new ApiResult();
        int num = infoService.updateAll(info);
        apiResult.setData(num);
        return apiResult;
    }

   /* @RequestMapping("/getAll")
    public List<Info> getAll() {

        return infoService.selectAll();
    }*/
}
