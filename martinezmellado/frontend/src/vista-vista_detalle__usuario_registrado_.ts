import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-mi_cabecera';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-comentario__usuario_registrado_';

@customElement('vista-vista_detalle__usuario_registrado_')
export class VistaVista_detalle__usuario_registrado_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-mi_cabecera style="width: 100%; height: 5%;"></vista-mi_cabecera>
 <vaadin-horizontal-layout style="width: 100%; height: 95%;">
  <vaadin-vertical-layout style="height: 100%; width: 60%; align-items: center; justify-content: center;">
   <img style="width: 90%; height: 90%;" src="../../resources/icons/video.svg">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 40%; height: 100%; align-items: center; justify-content: center;">
   <img style="width: 20%; height: 12%;" src="../../resources/icons/user.svg">
   <label>Usuario</label>
   <vaadin-horizontal-layout style="height: 5%; width: 60%; align-items: center; justify-content: space-around;">
    <label>Fecha</label>
    <label>Ubicacion</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="justify-content: center; align-items: center; width: 90%;">
    <label style="width: 100%;">Descripcion</label>
    <vaadin-vertical-layout style="width: 100%;">
     <vaadin-text-field label="Escribe tu comentario" style="width: 100%;"></vaadin-text-field>
     <vaadin-button style="align-self: flex-end;">
      Añadir comentario
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vista-comentario__usuario_registrado_ style="height: 50%; width: 90%;"></vista-comentario__usuario_registrado_>
   <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center;">
    <vaadin-button>
     Anterior
    </vaadin-button>
    <vaadin-button>
     Escribir comentario
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
