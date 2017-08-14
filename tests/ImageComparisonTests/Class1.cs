using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ImageMagick;

namespace ImageComparisonTests
{
    class ImageComparer
    {
        public static MagickImage ReadImage(string path)
        {
            try
            {
                var image = new MagickImage(path);
                return image;
            }
            catch(MagickException e)
            {
                Console.WriteLine($"Exception while loading image file: {path}, Exception: {e}");
                throw;
            }
        }

    }
}
