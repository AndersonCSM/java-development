import java.util.TreeMap;

public class ContaPalavras {
    public static void main(String[] args) {
        String texto = "Lorem ipsum dolor sit amet consectetur adipiscing elit Morbi consectetur interdum mi ac faucibus " +
                "urna commodo quis Vestibulum tempor molestie tellus nec hendrerit mauris scelerisque quis Aliquam vitae " +
                "metus id libero tincidunt eleifend Nunc congue elit et tortor volutpat vehicula Vestibulum ac quam id elit " +
                "congue ornare Lorem ipsum dolor sit amet consectetur adipiscing elit Proin pulvinar orci sapien Donec " +
                "malesuada vehicula aliquet Nunc sed dapibus ex Aenean vel volutpat diam tincidunt varius purus In imperdiet" +
                " ut arcu a vulputate Etiam lacinia rhoncus venenatis Nullam justo ipsum laoreet vel quam eu pellentesque " +
                "pharetra diam Suspendisse facilisis neque nibh in vulputate diam lacinia in Etiam hendrerit justo ut eros " +
                "ultrices elementum Integer at tellus commodo venenatis leo eget varius sem Donec pretium euismod dapibus " +
                "Sed accumsan laoreet dictum In hac habitasse platea dictumst Integer pharetra velit nec sapien rutrum " +
                "consequat In eu magna gravida finibus justo in feugiat urna Donec convallis felis eget bibendum ullamcorper" +
                " dolor elit pellentesque dui eu pellentesque mauris neque eu massa Etiam varius nulla sed sodales accumsan " +
                "risus dolor dictum ipsum eget tristique orci justo sed lorem Etiam imperdiet est eget metus venenatis id " +
                "varius felis suscipit Suspendisse potenti Phasellus congue tristique sem hendrerit maximus odio mollis id";

        TreeMap<String, Integer> mapa = new TreeMap<>();

        String palavras[] = texto.split(" ");

        for (String palavra: palavras){
            String palavraMin = palavra.toLowerCase();

            if (mapa.containsKey(palavraMin)){
                int qtd = mapa.get(palavraMin);
                mapa.put(palavraMin, qtd++);
            }
            else {
                mapa.put(palavraMin, 1);
            }
        }

        System.out.println(mapa);
    }

}
