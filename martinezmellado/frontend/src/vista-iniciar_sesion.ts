import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-iniciar_sesion')
export class VistaIniciar_sesion extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="height: 30%; width: 100%;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;"></vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
